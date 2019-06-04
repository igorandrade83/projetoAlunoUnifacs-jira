package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class FotoGrande {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var PassaUrl() throws Exception {
 return new Callable<Var>() {

   private Var lista = Var.VAR_NULL;

   public Var call() throws Exception {
    lista = cronapi.database.Operations.query(Var.valueOf("app.entity.foto"),Var.valueOf("select f.captura from foto f where f.id = :id"),Var.valueOf("id",cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.qsId"))));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeAttrValue"), Var.valueOf("crn-image-404561"), Var.valueOf("src"), cronapi.list.Operations.getFirst(lista));
    return Var.VAR_NULL;
   }
 }.call();
}

}

