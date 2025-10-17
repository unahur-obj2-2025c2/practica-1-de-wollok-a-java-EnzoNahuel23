package ar.edu.unahur.obj2.wtoj;
import java.util.ArrayList;
import java.util.List;

public class Plataforma {
    private static Plataforma plataforma = new Plataforma();
    private List<Usuario> usuarios = new ArrayList<>();

    private Plataforma() {}

    public static Plataforma getInstance() {
        return plataforma;
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void eliminarUsuarios() {
        usuarios.clear();
    }
}
