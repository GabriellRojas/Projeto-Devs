package rojas.gabriel.projetodevs.model;

import lombok.*;

/**
 @author Gabriel Rojas
 @since 01/05/2020
 @version Projeto 1.0
 */

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Devs {

    @Getter @Setter
    private String name;
    @Getter @Setter
    private String lastName;
    @Getter @Setter
    private String age;
    @Getter @Setter
    private String stack;

}
