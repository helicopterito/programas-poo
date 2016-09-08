
import java.util.Scanner;


/**
 *
 * @author Alvarado Moreno Néstor
 */
public class Persona {
    
    private String nombre;
    private String aPaterno;
    private String aMaterno;
    private String colorDeOjos;
    private String fechaNacimiento;
    private float peso;
    private float altura;
    private int edad;
    private char genero;

    
    
    public Persona()
    {
        this.nombre = "";
        this.aPaterno = "";
        this.aMaterno = "";
        this.colorDeOjos = "";
        this.fechaNacimiento = "";
        this.peso = 0/1;
        this.altura = 0/1;
        this.edad = 0;
        this.genero = 'a';
    }
    
    
    public Persona(String nombre, String apaterno, String amaterno, String colorDeOjos, String fechaNacimiento, 
            float peso, float altura, int edad, char genero) {
        this.nombre = nombre;
        this.aPaterno = apaterno;
        this.aMaterno = amaterno;
        this.colorDeOjos = colorDeOjos;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        this.genero = genero;
    }

    public void dormir() {
        System.out.println(this.getNombre() + " duerme");
    }
    
    
    public Persona reproducirse(Persona persona)
    {
        Persona bebe;
        Scanner lector = new Scanner(System.in);
        String name;
        String fecha;
        char gen;
        
        System.out.println("Como se va a llamar el bebe? ");
        name = lector.nextLine();
        System.out.println("Que fecha es?");
        fecha = lector.nextLine();
        System.out.println("Fue Hombre o Mujer? ");
        gen =lector.next().charAt(0);
        
        
        if(this.genero == 'H')
        {
            return bebe = new Persona(name, this.getaPaterno(), persona.getaPaterno(), persona.getColorDeOjos(),
            fecha, (float)4.3, (float)0.5, 0, gen);
        }
        else
        {
            return bebe = new Persona(name, persona.getaPaterno(), this.getaPaterno(), persona.getColorDeOjos(),
            fecha, (float)4.3, (float)0.5, 0, gen);
        }
    }
            
    public void repite(String repetir)
     {
         System.out.println(repetir);
     }
    
    public void repite(int repetir)
    {
        System.out.println(repetir);
    }

    public void jugar(String juego)
    {
        System.out.println(this.getNombre() + " juega a " + juego);
    }
    
    public void estudiar()
    {
        System.out.println(this.getNombre() + " estudia");
    }
    
    public void comer(String comida)
    {
        System.out.println(this.getNombre() + " come + " + comida);
    }
    
    public void contar()
    {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("\nHasta que numero cuenta " + this.getNombre()+"?\nRespuesta: ");
        int max = lector.nextInt();
        for (int i = 0; i < max; i++) {
            System.out.println(i);
            
        }
    }
    
    public void compararEdad(Persona persona)
    {
        if(this.getEdad() > persona.getEdad())
        {
            System.out.println(this.getNombre() + " es mayor que " + persona.getNombre());
        }
        else if(this.getEdad() < persona.getEdad())
        {
            System.out.println(this.getNombre() + " es menor que " + persona.getNombre());
        }
        else
        {
            System.out.println(this.getEdad() + " tiene la misma edad que " + persona.getEdad());
        }
    }
    public void repitealreves(String repetir)
    {
        for (int i = repetir.length() - 1; i >= 0; i--) {
            System.out.println(repetir.substring(i, i+1));
            
        }
        System.out.println();
    }
    public void cuenta(int xLimite)
    {
        for (int i = 0; i <= xLimite; i++) {
            System.out.println("numero: " + i + "\n");
        }
        
        System.out.println();
    }
    
    public int sumaEdades(int xEdad)
    {
        return this.edad + xEdad;
    }
    
    public int restaEdades(int xEdad)
    {
        return this.edad - xEdad;
    }
    
    public void getNombreAlreves()
    {
        
        System.out.println("\nEl nombre al reves es: ");
        for (int i = (this.nombre.length() - 1); i >= 0; i--) {
            System.out.print(nombre.charAt(i));
            
        }
        System.out.println();
    }
   
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the colorDeOjos
     */
    public String getColorDeOjos() {
        return colorDeOjos;
    }

    /**
     * @param colorDeOjos the colorDeOjos to set
     */
    public void setColorDeOjos(String colorDeOjos) {
        this.colorDeOjos = colorDeOjos;
    }

    /**
     * @return the fechaNacimiento
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the genero
     */
    public char getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }

    /**
     * @return the aPaterno
     */
    public String getaPaterno() {
        return aPaterno;
    }

    /**
     * @param aPaterno the aPaterno to set
     */
    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    /**
     * @return the aMaterno
     */
    public String getaMaterno() {
        return aMaterno;
    }

    /**
     * @param aMaterno the aMaterno to set
     */
    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }
    
    
}
