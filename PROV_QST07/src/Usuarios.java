import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Usuarios {
  private String senha;
  public Long telefone;
  public Long CPF;
  public String endereco;
  public String nomeUsuario;
  public Integer userCount;

  public Usuarios() {
    this.senha = "12345";
  }

  public Usuarios(Long telefone, Long CPF, String endereco, String nomeUsuario) {
    this.telefone = telefone;
    this.CPF = CPF;
    this.endereco = endereco;
    this.nomeUsuario = nomeUsuario;
    this.senha = "12345";
  }

  public List incluiUsuarios() {
    Scanner op1 = new Scanner(System.in);

    this.nomeUsuario = nomeUsuario;
    this.senha = senha;
    String opIn = "Inclusão";

    System.out.println("Usuário: " + nomeUsuario);
    String userVal = op1.nextLine();
    System.out.println("Senha: " + senha);
    String userPass = op1.nextLine();
    System.out.println("Operação realizada: " + opIn);
    String userOp = op1.nextLine();

    List user = new ArrayList<>();

    return user;

  }

  public void alteraUsuarios() {
    Scanner op2 = new Scanner(System.in);

    this.nomeUsuario = nomeUsuario;
    this.senha = senha;
    String opAlt = "Alteração";

    System.out.println("Usuário: " + nomeUsuario);
    String userVal = op2.nextLine();
    System.out.println("Senha: " + senha);
    String userPass = op2.nextLine();
    System.out.println("Operação realizada: " + opAlt);
    String userOp = op2.nextLine();
  }

  public void excluiUsuarios() {
    Scanner op3 = new Scanner(System.in);

    this.nomeUsuario = nomeUsuario;
    this.senha = senha;
    String opExc = "Exclusão";

    System.out.println("Usuário: " + nomeUsuario);
    String userVal = op3.nextLine();
    System.out.println("Senha: " + senha);
    String userPass = op3.nextLine();
    System.out.println("Operação realizada: " + opExc);
    String userOp = op3.nextLine();
  }

  public void listaUsuarios() {
    System.out.println("Os usuários existentes são: ");

    for (int i = 1; userCount < i; i++) {
      System.out.println("Usuário: " + nomeUsuario);
      System.out.println("Telefone: " + telefone);
      System.out.println("CPF: " + CPF);
      System.out.println("Endereço: " + endereco);
      System.out.println("Senha: " + senha);
    }
  }

  public void listarUsuarios(String nomeUsuario) {
    Scanner userName = new Scanner(System.in);

    System.out.println("Informe o nome que deseja procurar: ");
    String searchName = userName.nextLine();

    for (int i = 1; userCount < i; i++) {
      System.out.println("Usuário: " + nomeUsuario);
      System.out.println("Telefone: " + telefone);
      System.out.println("CPF: " + CPF);
      System.out.println("Endereço: " + endereco);
      System.out.println("Senha: " + senha);
    }
  }
}
