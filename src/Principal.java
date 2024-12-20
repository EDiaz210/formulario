public class Principal {
    int[] cedulas = new int[3];
    String[] nombres = new String[3];

    int totalIngresos = 0;

    public void agregarClientes(int cedula, String nombre) {
        if (totalIngresos < 3) {
            this.cedulas[totalIngresos] = cedula;
            this.nombres[totalIngresos] = nombre;
            totalIngresos++;
            System.out.println("Cliente agregado"+cedula+"."+nombre);
        } else {
            System.out.println("No se puede agregar mas información");
        }}


        public String mostrarClientes(){
        if (totalIngresos == 0) {
            return "No se puede agregar mas informacion";

        } else {
            StringBuilder datos = new StringBuilder();
            for (int i = 0; i < totalIngresos; i++) {
                datos.append("Cédula: ").append(cedulas[i]).append(", Nombre: ").append(nombres[i]).append("\n");
            }
            return datos.toString();
        }
        }
}

