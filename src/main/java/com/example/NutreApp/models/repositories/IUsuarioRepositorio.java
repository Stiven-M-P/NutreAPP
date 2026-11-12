package com.example.NutreApp.models.repositories;


    
    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.stereotype.Repository;
    import org.springframework.stereotype.repository;
    import java.util.List;
    import java.util.Optional;

    import com.example.NutreAPP.models.Usuario;
    import com.example.NutreApp.models.helpers.Departamento;

    @Repository 
    public interface IUsuarioRepositorio extends JpaRepository<Usuario, UUID> {

//consultas prefabricadas
// Buscar un usuario asosiado a un departamento y a un rol especifico

List<Usuario> findByDepartamentoAndRol(String departamento, String rol);

optional <Usuario> findByCorreo (String correo);

List<Usuario> findByRolRorderBynombreasc (String rol);

Boolean existsByCorreo(String correo);



}
