import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.NotFoundException;
import com.google.zxing.RGBLuminanceSource;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.QRCodeReader;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Barcode extends Food {
    private String barcodeValue;

    public Barcode(String name, String barcodeValue) {
        super(name);
        this.barcodeValue = barcodeValue;
    }

    public boolean searchForValue() {
        try {
            BufferedImage image = ImageIO.read(new File("barcode.png")); // Εάν ήταν αποθηκευμένο ως "barcode.png"
            RGBLuminanceSource source = new BufferedImageLuminanceSource(image);
            BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
            Reader reader = new QRCodeReader();

            Result result = reader.decode(bitmap);
            String scannedValue = result.getText();

            return scannedValue.equals(barcodeValue);
        } catch (IOException | NotFoundException e) {
            e.printStackTrace();
        }

        return false;
    }

    public String promptInabilityValueMessage() {
        return "The barcode value could not be found.";
    }
}
