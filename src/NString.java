public class NString {

    String str1;
    StringBuilder str2;

    public NString(String lastString) {
        this.str1 = lastString;
        str2 = new StringBuilder();

    }

    public String returnNewString() {
        Number number = new Number(str1.charAt(0) - '0');
        for (int i = 1; i < str1.length(); i++) {
            int numberFromString = getNumber(str1.charAt(i));
            if (number.equals(numberFromString)) {
                number.count();
            }
            else {
                str2.append(number.getCounter());
                str2.append(number.getNumber());
                number = new Number(getNumber(str1.charAt(i)));
            }
        }
        str2.append(number.getCounter());
        str2.append(number.getNumber());
        return str2.toString();
    }

    public int getNumber(int fromString) {
        return fromString - '0';
    }
}
