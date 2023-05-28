public class TrainingPackage extends WorkoutConfiguration {
    private String trainingPackage;
    private String difficultySetting;
    private int durationSetting;

    public String getDifficultySetting() {
        return difficultySetting;
    }

    public void setDifficultySetting(String difficultySetting) {
        this.difficultySetting = difficultySetting;
    }

    public int getDurationSetting() {
        return durationSetting;
    }

    public void setDurationSetting(int durationSetting) {
        this.durationSetting = durationSetting;
    }

    public boolean checkForTrainingPackage() {
       List<String> availablePackages = generateTrainingPackages();

       if (availablePackages.contains(trainingPackage)) {
        return true;
    }  else {
        System.out.println("Failed to find package: " + trainingPackage);
        return false;
    }


  }
       
    

    public void displayPackage(String trainingPackage) {
        
        System.out.println("Training Package: " + trainingPackage);
    }

    public void displaySimilarPackage(String trainingPackage) {
        
        System.out.println("Similar Training Package: " + trainingPackage);
    }

   public String generateTrainingPackages() {
     List<String> trainingPackages = new ArrayList<>();
     trainingPackages.add("Training Package Ena");
     trainingPackages.add("Training Package Duo");
     trainingPackages.add("Training Package Tria");

    StringBuilder packageList = new StringBuilder();
    for (String package : trainingPackages) {
        packageList.append(package).append(", ");
    }

   
    if (packageList.length() > 0) {
        packageList.setLength(packageList.length() - 2);
    }

    return packageList.toString();
}

}
