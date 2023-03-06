using System;

public class Persona
{
    // Atributos 
    private static int contadorPersonas = 0;

    private string nombre;
    private string primerApellido;
    private string segundoApellido;
    private bool hombre;
    private bool mujer;
    private DateTime fechaNacimiento;
    private string dni;
    private float sueldo;

    // Constructor
    public Persona(string nombre, string primerApellido, string segundoApellido, bool hombre, bool mujer, DateTime fechaNacimiento, string dni, float sueldo)
    {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.hombre = hombre;
        this.mujer = mujer;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
        this.sueldo = sueldo;
        contadorPersonas++;
    }

    public string Nombre 
    { 
        get => nombre; 
        set => nombre = value; 
    }

    public string PrimerApellido 
    { 
        get => primerApellido; 
        set => primerApellido = value; 
    }

    public string SegundoApellido 
    { 
        get => segundoApellido; 
        set => segundoApellido = value; 
    }

    public float Sueldo 
    { 
        get => sueldo; 
        set => sueldo = value; 
    }

    public string Sexo 
    { 
        get => hombre ? "Hombre" : mujer ? "Mujer" : ""; 
        set 
        { 
            hombre = value.ToLower() == "hombre"; 
            mujer = value.ToLower() == "mujer"; 
        } 
    }

    public string NombreCompleto 
    { 
        get => $"{nombre} {primerApellido} {segundoApellido}"; 
    }

    public int Edad 
    { 
        get => DateTime.Today.Year - fechaNacimiento.Year - (fechaNacimiento > DateTime.Today.AddYears(-edad) ? 1 : 0); 
    }

    public string FechaDeNacimiento 
    { 
        get => fechaNacimiento.ToShortDateString(); 
        set => fechaNacimiento = DateTime.Parse(value); 
    }

    public static int ContadorPersonas 
    { 
        get => contadorPersonas; 
    }

    // Método para validar el DNI
    private static bool ValidarDni(string dni)
    {
        bool esValido = false;

        if (dni.Length == 9)
        {
            string numeros = dni.Substring(0, 8);
            char letra = dni[8];

            int resto = int.Parse(numeros) % 23;
            string letrasValidas = "TRWAGMYFPDXBNJZSQVHLCKE";

            if (letra == letrasValidas[resto])
            {
                esValido = true;
            }
        }

        return esValido;
    }

    public static int CuantasPersonas()
       {
        return contadorPersonas;
        }

    static void Main(string[] args)
    {
    List<Persona> personas = new List<Persona>(10);
        personas.Add(new Persona("Manuel", "AAAA", "AAA", "1977, 5, 15", "hombre", 1500));
        personas.Add(new Persona("Cristina", "AAA", "AAAA", "2001, 8, 25", "mujer", 2500));
    

        personas.Sort((p1, p2) => p1.Edad.CompareTo(p2.Edad));

        Persona personaJoven = personas[0];
        Persona personaVieja = personas[personas.Count - 1];   
        
        var edadMedia = personas.Average(p => p.Edad);

        var MedioMenores30 = personas
            .Where(p => p.Edad < 30)
            .Average(p => p.Sueldo);

        var MedioMayores30 = personas
             .Where(p => p.Edad >= 30)
            .Average(p => p.Sueldo);

        var MedioEntre35y45 = personas
            .Where(p => p.Edad >= 35)
            .Where(p => p.Edad <= 45)
            .Average(p => p.Sueldo);


    }

   
}