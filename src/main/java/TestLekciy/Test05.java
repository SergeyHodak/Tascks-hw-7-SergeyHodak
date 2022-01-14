package TestLekciy;

enum DeveloperLevel05 {
    Junior(0){
        @Override
        public boolean isJunior() {
            return true;
        }
    },
    Middle(2) {
        @Override
        public boolean isMiddle() {
            return true;
        }
    },
    Senior(5){
        @Override
        public boolean isSenior() {
            return true;
        }
    };

    private final int yearsOfExperience;

    public boolean isJunior() {return false;}

    public boolean isMiddle() {return false;}

    public boolean isSenior(){return false;}

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    DeveloperLevel05 (int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}