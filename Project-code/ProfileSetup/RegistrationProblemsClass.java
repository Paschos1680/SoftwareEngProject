public class RegistrationProblems extends UsersProfile {
    private String usernameRegistered;

    public RegistrationProblems(String usernameRegistered) {
        this.usernameRegistered = usernameRegistered;
    }

    public boolean usernameValidationCheck() {
        return getUsername().matches("[a-zA-Z0-9]+");
    }

    public boolean usernameNotRegistered() {
        DatabaseConnection connection = new DatabaseConnection();  // Θεωρείται οτι υπάρχει βάση δεδομένων
        connection.openConnection();
        String selectQuery = "SELECT * FROM users WHERE username = ?";
        connection.prepareStatement(selectQuery);
        connection.setString(1, getUsername());
        ResultSet resultSet = connection.executeQuery();
        boolean isNotRegistered = !resultSet.next();
        connection.closeConnection();
        return isNotRegistered;
    }

    public boolean usernameAlreadyExists() {
        DatabaseConnection connection = new DatabaseConnection();
        connection.openConnection();
        String selectQuery = "SELECT * FROM users WHERE username = ?";
        connection.prepareStatement(selectQuery);
        connection.setString(1, getUsername());
        ResultSet resultSet = connection.executeQuery();
        boolean exists = resultSet.next();
        connection.closeConnection();
        return AlreasyExists;
    }

    public void refuseToAddQuantitiveData() {
        System.out.println("We reccomend you to add your quantitive data so you dont miss out on our amazing Features!.");
    }


    public String askForUsernameAgain() {
        System.out.println("Registration problem: The entered username is not valid or taken. Please enter a new username:");
        String newUsername = scanner.nextLine();
        setUsername(newUsername);
        return newUsername;
    }

    public void refuseToAnswerQuestions() {
        System.out.println("We reccomend you to add your quantitive data so you dont miss out on our amazing Features!.");
    }
}
