package TestLekciy;

enum Season02 { //enum Season
    Summer,
    Autumn,
    Winter,
    Spring
}

class SeasonFormatter02 {
    public String getSeasonName(Season02 season) {
        switch(season) {
            case Summer: return "Summer";
            case Autumn: return "Autumn";
            case Winter: return "Winter";
            case Spring: return "Spring";
        }

        throw new IllegalArgumentException("We don't know name for " + season);
    }
}

class Test02 {
    public static void main(String[] args) {
        SeasonFormatter02 sf = new SeasonFormatter02();

        System.out.println(sf.getSeasonName(Season02.Summer)); //Summer
    }
}