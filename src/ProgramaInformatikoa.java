public class ProgramaInformatikoa{
    /**
     * BIRFAKTORIZAZIOA:
     * ProgramaInformatikoa klasea sortu da, eta goodbyeInprimatu metodoa gehitu da.
     * Metodoa "Goodbye!" stringa itzultzen du, eta Testa klasean unitate proba bat gehitu da metodo hori
     * behar bezala funtzionatzen dela ziurtatzeko.
     * @param args
     */
    public static void main (String[] args){
        System.out.println("1. GAIA");
        System.out.println("Hau da nik ulertu dudana: ");
        Informazioa();
        goodbyeInprimatu();
    }

    public static String goodbyeInprimatu() {
        return "Goodbye!";
    }

    /**
     * Programa informatikoari buruzko informazioa inprimatzen du.
     */
    public static void Informazioa() {
        System.out.println("PROGRAMA INFORMATIKOA: ");
        System.out.println("Programa informatikoa ordenagailu batek barneratu eta exekutatu ditzakeen adierazpenak dira. Normalean sekuentzialki exekutatzen dira baina zikloetan posible da ere bai.  ");
        System.out.println("Softwere deritzo programa informatikoen multzoari eta haien adibide batzuk aplikazioak, sistema eragilea etab. izan daitezke.");
        System.out.println("Software mota nagusiak honakoak dira: ");
        System.out.printf("Aplikazioak: erabiltzaileentzako tresnak (testuak, kalkuluak, diseinua…).\n" + //
                        "\n" + //
                        "Pertsonalizatuak: neurrira egindakoak.\n" + //
                        "\n" + //
                        "Utilidadeak: mantentze eta laguntza tresnak.\n" + //
                        "\n" + //
                        "Sistema eragilea: hardwarea eta baliabideak kudeatzen ditu.\n" + //
                        "\n" + //
                        "Driver-ak: periferikoekin elkarreragina.");
        System.out.println("");
    }
}
