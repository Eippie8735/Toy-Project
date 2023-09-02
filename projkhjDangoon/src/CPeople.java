public class CPeople {
    private String mom;
    private String dad;
    private String me;
    private int lifeSpan;

    public CPeople(String dad, String mom, String me, int lifeSpan) {
        this.mom = mom;
        this.dad = dad;
        this.me = me;
        this.lifeSpan = lifeSpan;
    }


    public String getMom() {return mom;}
    public void setMom(String mom) {this.mom = mom;}

    public String getDad() {return dad;}
    public void setDad(String dad) {this.dad = dad;}

    public String getMe() {return me;}
    public void setMe(String me) {this.me = me;}

    public int getLifeSpan() {return lifeSpan;}
    public void setLifeSpan(int lifeSpan) {this.lifeSpan = lifeSpan;}


    public void mShow(){
        System.out.printf("아버지 : %s / 어머니 : %s / 나 : %s / 산 날 : %d\n", this.dad, this.mom, this.me, this.lifeSpan);
    }
}
