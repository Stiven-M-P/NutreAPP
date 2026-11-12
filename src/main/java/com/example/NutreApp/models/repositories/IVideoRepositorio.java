
package com.example.NutreApp.models.repositories;



import com.example.NutreApp.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface IVideoRepositorio extends JpaRepository<Video, Integer> {


    List<Video> findByCategoria(String categoria);

    List<Video> findByTituloContainingIgnoreCase(String titulo);

    Optional<Video> findFirstByDescripcionContainingIgnoreCase(String descripcion);
    
    List<Video> findByUrl(String url);

    List<Video> findByTituloContainingIgnoreCaseAndCategoria(String titulo, String categoria);

}