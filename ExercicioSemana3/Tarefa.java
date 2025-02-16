import java.time.LocalDateTime;
import java.util.Comparator;

public class Tarefa {
    private String titulo;
    private LocalDateTime dataHora;

    public Tarefa(LocalDateTime dataHora, String titulo) {
        this.dataHora = dataHora;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "titulo='" + titulo + '\'' +
                ", dataHora=" + dataHora +
                '}';
    }

    public static Comparator<Tarefa> ordenaPorTitutlo() {
        return Comparator.comparing(Tarefa::getTitulo);
    }

    public static Comparator<Tarefa> ordenaPorOrdemCronologica() {
        return Comparator.comparing(Tarefa::getDataHora);
    }
}
