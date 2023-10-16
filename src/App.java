import java.time.LocalDate;

import desafio.dominio.BootCamp;
import desafio.dominio.Curso;
import desafio.dominio.Dev;
import desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentoria = new Mentoria();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(12);
        curso2.setTitulo("Curso Java2");
        curso2.setDescricao("Descrição do curso Java2");
        curso2.setCargaHoraria(12);
        mentoria.setTitulo("JAVA");
        mentoria.setDescricao("Descrição Mentoria");
        mentoria.setData(LocalDate.now());

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp JAVA");
        bootCamp.setDescricao("Descrição BootCamp JAVA");
        bootCamp.getConteudo().add(curso1);
        bootCamp.getConteudo().add(curso2);
        bootCamp.getConteudo().add(mentoria);


        Dev dev1 = new Dev();
        Dev dev2 = new Dev();
        dev1.setNome("Leonardo");
        dev2.setNome("Marina");

        dev1.inscreverBootcamp(bootCamp);
        dev2.inscreverBootcamp(bootCamp);

        System.out.println("Nome: " + dev1.getNome());
        System.out.println("Conteúdos Inscritos" + dev1.getConteudosInscritos());
        System.out.println("Nome: " + dev2.getNome());
        System.out.println("Conteúdos Inscritos" + dev2.getConteudosInscritos());
    }
}
