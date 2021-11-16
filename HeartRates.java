public class HeartRates {

    private String firstName, lastName, DOB;
    private int monthOfBirth, dayOfBirth, yearOfBirth;
    
    public HeartRates(String firstName, String lastName, int dayOfBirth,  
            int monthOfBirth, int yearOfBirth) {
    
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = Integer.toString(dayOfBirth) + '/' +
            Integer.toString(monthOfBirth) + '/' + Integer.toString(yearOfBirth);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }   
    
    public String getDOB() {
        return this.DOB;
    }

    public String getHeartRates(int yearOfBirth) {

        int age;
        age = 2020 - yearOfBirth;
        
        if (age == 20 || age <= 29 ) {
            return "100-170 bpm";
        }

        if ( age == 30 || age <= 34 ) {
            return "95-162 bpm";
        }

        if (age == 35 || age <= 39) {
            return "93-157 bpm";
        }

        if (age == 40 || age <= 44 ) {
            return "90-153 bpm";
        }

        if (age == 45 || age <= 49 ) {
            return "88-149 bpm";
        }

        if (age == 50 || age <= 54 ) {
            return "85-145 bpm";
        }

        if (age == 55 || age <= 59 ) {
            return "83-140 bpm";
        }
        
        if (age == 60 || age <= 64 ) {
            return "80-136 bpm";
        }

        if (age == 65 || age <= 69 ) {
            return "78-132 bpm";
        }

        if (age == 70 ) {
            return "75-128 bpm";
        }

        return null;

    }

}

