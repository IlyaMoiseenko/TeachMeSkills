package task_1;

import java.util.regex.Pattern;

public class Validator {
    private String regexp = "^[\\d]{3}\\D[\\d]{2}\\D[\\d]{3}\\D[\\d]{1}$";
    private final Pattern pattern = Pattern.compile(regexp);

    public boolean validate(String address) {
        return pattern.matcher(address).matches();
    }
}
