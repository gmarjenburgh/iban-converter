package nl.booyah.iban;


import java.util.TreeMap;

public final class Banks {

    public enum BANKCODE {
        ABNA("ABN AMRO BANK NV"),
        AEGO("AEGON BANK NV"),
        ANAA("ALLIANZ NEDERLAND ASSET MANAGEMENT"),
        ANDL("ANADOLUBANK NEDERLAND NV"),
        ARBN("ACHMEA RETAIL BANK NV"),
        ARSN("ARGENTA SPAARBANK NV"),
        ARTE("GE ARTESIA BANK"),
        ASNB("ASN BANK"),
        ATBA("AMSTERDAM TRADE BANK NV"),
        BCDM("BANQUE CHAABI DU MAROC"),
        BCIT("INTESA SANPAOLO SPA"),
        BICK("BINCKBANK NV"),
        BINK("BINCKBANK NV"),
        BKCH("BANK OF CHINA"),
        BKMG("BANK MENDES GANS NV"),
        BLGW("BLG WONEN"),
        BMEU("BMCE EUROSERVICES"),
        BNGH("NV BANK NEDERLANDSE GEMEENTEN"),
        BNPA("BNP PARIBAS SA"),
        BOFA("BANK OF AMERICA NA"),
        BOFS("BANK OF SCOTLAND PLC"),
        BOTK("BANK OF TOKYO-MITSUBISHI UFJ"),
        BUNQ("BUNQ"),
        CHAS("JPMORGAN CHASE"),
        CITC("CITCO BANK NEDERLAND"),
        CITI("CITIBANK INTERNATIONAL PLC"),
        COBA("COMMERZBANK AG"),
        DEUT("DEUTSCHE BANK"),
        DHBN("DEMIR-HALK BANK (NEDERLAND) NV"),
        DLBK("DELTA LLOYD BANK NV"),
        DNIB("NIBC BANK NV"),
        FBHL("CREDIT EUROPE BANK NV"),
        FLOR("DE NEDERLANDSCHE BANK NV"),
        FRBK("FRIESLAND BANK NV"),
        FRGH("FRIESCH GRONINGSE HYPOTHEEK BANK"),
        FTSB("ABN AMRO BANK NV"),
        FVLB("F.VAN LANSCHOT BANKIERS NV"),
        GILL("THEODOOR GILISSEN NV"),
        HAND("(SVENSKA) HANDELSBANKEN AB"),
        HHBA("HOF HOORNEMAN BANKIERS"),
        HSBC("HSBC BANK PLC"),
        ICBK("INDUSTRIAL AND COMMERCIAL BANK OF CHINA"),
        INGB("ING BANK NV"),
        INSI("INSINGER DE BEAUFORT NV"),
        ISBK("ISBANK"),
        KABA("YAPI KREDI BANK NEDERLAND NV"),
        KASA("KAS BANK NV"),
        KNAB("KNAB"),
        KOEX("KOREA EXCHANGE BANK"),
        KRED("KBC BANK NEDERLAND NV"),
        LOCY("LOMBARD ODIER DARIER HENTSCH & CIE"),
        LOYD("LLOYDS TSB BANK PLC"),
        LPLN("LEASEPLAN CORPORATION NV"),
        MHCB("MIZUHO CORPORATE BANK NEDERLAND NV"),
        NNBA("NATIONALE-NEDERLANDEN BANK NV"),
        NWAB("NEDERLANDSE WATERSCHAPSBANK NV"),
        PCBC("CHINA CONSTRUCTION BANK SA"),
        RABO("RABOBANK GROEP"),
        RBOS("ROYAL BANK OF SCOTLAND"),
        RBRB("REGIOBANK"),
        SNSB("SNS BANK NV"),
        SOGE("SOCIETE GENERALE"),
        STAL("STAALBANKIERS NV"),
        TEBU("THE ECONOMY BANK NV"),
        TRIO("TRIODOS BANK NV"),
        UBSW("UBS BANK (NETHERLANDS) BV"),
        UGBI("GARANTIBANK INTERNATIONAL NV"),
        VOWA("VOLKSWAGEN BANK"),
        ZWLB("ZWITSERLEVENBANK");

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
