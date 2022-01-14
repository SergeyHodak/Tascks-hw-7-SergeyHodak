package TestLekciy;

class Test01 { //class Seasons
    public static final int SUMMER = 1;
    public static final int AUTUMN = 2;
    public static final int WINTER = 3;
    public static final int SPRING = 4;

    public String getSeason(int season) {
        switch(season) { //было swtich а должно быть switch
            case SUMMER: return "Summer";
            case AUTUMN: return "Autumn";
            case WINTER: return "Winter";
            case SPRING: return "Spring";
        }
        throw new IllegalArgumentException("Unknown season id: " + season); // не было new
    }

    public static void main(String[] args) {
        Test01 s = new Test01();
        System.out.println(s.getSeason(Test01.WINTER)); //Winter - было "//winter" а должно быть "//Winter"
        System.out.println(s.getSeason(6)); //Unknown season id: 6
    }
}