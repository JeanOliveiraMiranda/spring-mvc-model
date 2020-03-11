package br.com.fapen.estoque.domain.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Login
 */
@Entity(name = "tb_login")
public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_login", nullable = false)
    private Long idLogin;

    // O tipo desse cara vai ser a classe Pessoa dentro de entities
    @Column(name = "id_pessoa", nullable = false)
    private Long idPessoa;

    @Column(name = "login", nullable = false, length = 60)
    private String login;

    @Column(name = "senha", nullable = false, length = 100)
    private String senha;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column(name = "dt_cadastro", nullable = false)
    private Date dtCadastro;

    @Column(name = "tipo_usuario", nullable = false)
    private Integer tipoUsuario;

    @Column(name = "inativo", nullable = false)
    private boolean inativo;

    public Long getIdLogin() {
        return this.idLogin;
    }

    public void setIdLogin(Long idLogin) {
        this.idLogin = idLogin;
    }

    public Long getIdPessoa() {
        return this.idPessoa;
    }

    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDtCadastro() {
        return this.dtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public Integer getTipoUsuario() {
        return this.tipoUsuario;
    }

    public void setTipoUsuario(Integer tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public boolean isInativo() {
        return this.inativo;
    }

    public boolean getInativo() {
        return this.inativo;
    }

    public void setInativo(boolean inativo) {
        this.inativo = inativo;
    }

}