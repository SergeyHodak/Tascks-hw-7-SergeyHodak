package TestLekciy;

enum Season03 {
    Summer,
    Autumn,
    Winter,
    Spring
}

class Test03 { //class ColdDetector
    public boolean isCold(Season03 season) {
        if (season == Season03.Summer || season == Season03.Autumn) {
            return true;
        }

        return false;
    }
}
class SeasonTest03 {
    public static void main(String[] args) {
        Test03 sf = new Test03();

        System.out.println(sf.isCold(Season03.Winter)); //Summer
    }
}