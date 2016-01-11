package nl.booyah.iban;


import java.util.TreeMap;

public final class Banks {

    public enum BANKCODE {
        ABNA("ABN AMRO BANK NV");


        private final String name;

        BANKCODE(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static final TreeMap<String, BANKCODE> BANK_NAME_MAP;
    static {
        BANK_NAME_MAP = new TreeMap<String, BANKCODE>();
        for (BANKCODE bankcode : BANKCODE.values()) {
            BANK_NAME_MAP.put(bankcode.getName(), bankcode);
        }
    }
}
