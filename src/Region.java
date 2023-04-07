public enum Region {
    BATKEN("оорук"),
    OSH("самса"),
    YSYKKOL("Озеро"),
    DJALALABAT("жугоруну мака дейт "),
    CHUI("Тундуктуктор"),
    NARYN("Naryn reka "),
    TALAS("Fasol  ");

    private final String regions;

    Region(String regions) {
        this.regions = regions;
    }

    public String getRegions() {
        return regions;
    }

    @Override
    public String toString() {
        return  regions +"\n";
    }
}
