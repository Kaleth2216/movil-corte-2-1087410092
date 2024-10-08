package Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios") // Nombre de la tabla en la base de datos
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") // Nombre de la columna en la tabla
    private Long id;

    @Column(name = "nombre", nullable = false, length = 100) // Definición de la columna nombre
    private String nombre;

    @Column(name = "apellido", nullable = false, length = 100) // Definición de la columna apellido
    private String apellido;

    @Column(name = "correo", nullable = false, unique = true, length = 150) // Correo debe ser único
    private String correo;

    @Column(name = "direccion", length = 255) // Dirección opcional, puede tener hasta 255 caracteres
    private String direccion;

    @Column(name = "telefono", length = 20) // Teléfono con una longitud máxima de 20 caracteres
    private String telefono;

    @Column(name = "password", nullable = false) // Columna para la contraseña, renombrada como password
    private String password;

    // Constructor vacío
    public Usuario() {}

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
