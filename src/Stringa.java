public class Stringa {
    String[] x;

    public Stringa(String[] x) {
        this.x = x;
    }

    public String[] getX() {
        return x;
    }

    public void setX(String[] x) {
        this.x = x;
    }

    public String stringaPiuLunga() {
        String result = " ";
        for (int i = 0; i < x.length; i++) {
            if (result.length() < x[i].length()) {
                result = x[i];
            }
        }
        return result;
    }
    
    public int contaLettere(char lettera){
        int conto = 0;
        for (int i = 0; i < x.length; i++) {
        String parola = x[i];
        if (parola.toLowerCase().charAt(0) == Character.toLowerCase(lettera)){
            conto++;
        }
        }
        return conto;
    }
}