public class Cookie {

    private boolean cookieChocolateChips;
    private String cookieTexture;


    public Cookie(){
        this.cookieChocolateChips = true;
        this.cookieTexture = "blabla";
    }

    public Cookie(boolean cookieChocolateChips, String cookieTexture) {
        this.cookieChocolateChips = cookieChocolateChips;
        this.cookieTexture = cookieTexture;
    }

    public boolean isCookieChocolateChips() {
        return cookieChocolateChips;
    }

    public void setCookieChocolateChips(boolean cookieChocolateChips) {
        this.cookieChocolateChips = cookieChocolateChips;
    }

    public String getCookieTexture() {
        return cookieTexture;
    }

    public void setCookieTexture(String cookieTexture) {
        this.cookieTexture = cookieTexture;
    }

    @Override
    public String toString() {
        return "Cookie{" +
                "cookieChocolateChips=" + cookieChocolateChips +
                ", cookieTexture='" + cookieTexture + '\'' +
                '}';
    }
}
