package co.proyectoGrado.proyectoGrado.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name ="CATEGORIA_CONTENIDO")
@NoArgsConstructor
public class CategoriaEntity {

    @Id
    @Column(name="idCategoria")
    private int idCategoria;
    //private List<Pregunta> pregunta;

}
