import java.util.LinkedList;


/**
 * @author ZavalaChiraPiero
 * @version 1
 *
 */
public class Main {
    public static void main(String[] args) {

        LinkedList<Futbolista> listafutbolistas = getFutbolistas();

        imprimirLista(listafutbolistas);

        eliminarPorId(listafutbolistas, 2);

        imprimirLista(listafutbolistas);

        listafutbolistas.removeFirst();
        System.out.println("****remove.First****");
        imprimirLista(listafutbolistas);

        listafutbolistas.removeLast();

        System.out.println("****removeLast()****");
        imprimirLista(listafutbolistas);

        listafutbolistas.clear();
        System.out.println("****clear()****");

        imprimirLista(listafutbolistas);


    }

    /**
     * @return
     * @Inizializamos 4 Futbolistas
     * Barza 2010
     */
    private static LinkedList<Futbolista> getFutbolistas() {

        LinkedList<Futbolista> listafutbolistas = new LinkedList<>();

        Futbolista villa = new Futbolista(1, "David", "Villa",
                34, 7, "Delantero");

        Futbolista puyol = new Futbolista(2, "Carles", "Puyol",
                31, 5, "Defensa");

        Futbolista busquests = new Futbolista(3, "Sergio", "Busquets"
                , 21, 5, "Centrocampista");

        Futbolista iniesta = new Futbolista(4, "Andres", "Iniesta",
                25, 8, "Centrocampista");

        listafutbolistas.add(villa);

        listafutbolistas.add(puyol);

        listafutbolistas.add(busquests);

        listafutbolistas.add(iniesta);

        return listafutbolistas;
    }

    /**
     * @param listafutbolista
     * @param id
     * @metodo que elimina a Futbolista de la lista
     */
    public static void eliminarPorId(LinkedList<Futbolista> listafutbolista, int id) {

        //Elimina de la lista por id de Futbolista
        for (Futbolista futbolista :
                listafutbolista) {

            if (futbolista.getId() == id) {
                listafutbolista.remove(futbolista);
                break;
            }

        }
        System.out.println("****Se elimino el id " + id + " ****");
    }

    /**
     * @param listafutbolista
     * @Imprimir lista
     *
     */
    public static void imprimirLista(LinkedList<Futbolista> listafutbolista) {

        System.out.println("****Lista****");
        for (Futbolista futbolista :
                listafutbolista) {
            System.out.println(futbolista.toString());
        }

    }
}