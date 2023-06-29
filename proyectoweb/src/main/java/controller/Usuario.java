package controller;

import java.util.List;
/* importaciones para los servlet */
import java.io.IOException;
import javax.servlet.ServletException;
/*Estas importaciones son para utilizar las clases base proporcionadas por la API de Servlets de Java */
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
import model.UsuarioDao;
import model.UsuarioVo;

/*  una clase que puede manejar solicitudes y respuestas HTTP de un servlet */
public class Usuario extends HttpServlet {

    /* crean instancias de las clases UsuarioDao y UsuarioVo */
    UsuarioDao ud= new UsuarioDao();
    UsuarioVo uv= new UsuarioVo();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entro Al DoGet");
        String accion=req.getParameter("accion");/* Se obtiene el valor del parámetro "accion" de la solicitud */
        

        /* Se utiliza un switch para realizar
         diferentes acciones según el valor de la variable accion. */
        switch (accion) {

            case "abrirForm":
            abrirForm(req,resp);
            break;

            case "consultar":
            listar(req,resp);
            break;

            case "editar": 
            listarUsuario(req,resp);
            System.out.println("ENTRO CASO, se recibe "+ req.getParameter("id"));
            break; 

            case "inicio": 
            req.getRequestDispatcher("index.jsp").forward(req, resp);
            break; 

            default:
            System.out.println("NO Encontro La Variable");
                break;
            }
      
        }
  
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ENTRO AL DOPOST");
        String a=req.getParameter("accion");


        /* Se utiliza un switch para realizar 
         acciones según el valor de la variable a */
        switch (a) {
            case "registrarUsuario":
            registrarUsuario(req,resp);
            
            break;
            case "editarUsuario":
            editarUsuario(req,resp);
            break;

        } 

}

private void abrirForm(HttpServletRequest req, HttpServletResponse resp){

    /* try para capturar posibles excepciones/  /atch por si pasa aguna exepcion se bloquea*/
    try{
        req.getRequestDispatcher("views/registrar.jsp").forward(req, resp);/* carga y muestra la página "registrar.jsp */
        System.out.println("El Formulario Ha Sido Abierto");
    }catch(Exception e){
        System.out.println("El formulario NO ha sido abierto"+e.getMessage().toString());
    }
    }



private void registrarUsuario(HttpServletRequest req, HttpServletResponse resp) {

        System.out.println("ingresaste al formulario");

        if(req.getParameter("nombre")!=null){
            uv.setNombre(req.getParameter("nombre"));
        }
        if(req.getParameter("tipoDocumento")!=null){
            uv.setTipoDocumento(req.getParameter("tipoDocumento"));
        }
        if(req.getParameter("numDocumento")!=null){
            uv.setNumDocumento(Integer.parseInt(req.getParameter("numDocumento")));
        }
        if(req.getParameter("numCelular")!=null){
            uv.setNumCelular(Integer.parseInt(req.getParameter("numCelular")));
        }
        if(req.getParameter("correo")!=null){
            uv.setCorreo(req.getParameter("correo"));
        }
        if(req.getParameter("contrasena")!=null){
            uv.setContrasena(req.getParameter("contrasena"));
        }
        if(req.getParameter("estado")!=null){
            uv.setEstado(true);
        }else{
            uv.setEstado(false);
        }
        
        try {
            ud.registrarse(uv);
            System.out.println("Registro insertado correctamente");
            listar(req, resp);
        } catch (Exception e) {
            System.out.println("Error en la inserción del registro "+e.getMessage().toString());
        }
        
    }

private void listar(HttpServletRequest req, HttpServletResponse resp) {
        try {
            List usuario=ud.listar();
            req.setAttribute("usuario", usuario);
            req.getRequestDispatcher("views/consultar.jsp").forward(req, resp);
            System.out.println("Datos listados correctamente");
        } catch (Exception e) {
            System.out.println("Hay problemas al listar los datos "+e.getMessage().toString());
    }
}

private void listarUsuario(HttpServletRequest req, HttpServletResponse resp) {
    try {
        UsuarioVo usuVo = new UsuarioVo();
        usuVo.setIdUsuario(Integer.parseInt(req.getParameter("id")));
        List usuario = ud.listarUsuario(usuVo.getIdUsuario());
        req.setAttribute("usuario", usuario);
        req.getRequestDispatcher("views/editar.jsp").forward(req, resp);
        System.out.println("Datos listados correctamente");
    } catch (Exception e) {
        System.out.println("Hay problemas al listar los datos "+e.getMessage().toString());
}
}
private void editarUsuario(HttpServletRequest req, HttpServletResponse resp){

    System.out.println("ingresaste al formulario");

        if(req.getParameter("nombre")!=null){
            uv.setNombre(req.getParameter("nombre"));
        }
        if(req.getParameter("tipoDocumento")!=null){
            uv.setTipoDocumento(req.getParameter("tipoDocumento"));
        }

        if(req.getParameter("numCelular")!=null){
            uv.setNumCelular(Integer.parseInt(req.getParameter("numCelular")));
        }
        if(req.getParameter("correo")!=null){
            uv.setCorreo(req.getParameter("correo"));
        }
        if(req.getParameter("contrasena")!=null){
            uv.setContrasena(req.getParameter("contrasena"));
        }
        if(req.getParameter("numDocumento")!=null){
            uv.setNumDocumento(Integer.parseInt(req.getParameter("numDocumento")));
        }

        int idI = Integer.parseInt(req.getParameter("id"));
        uv.setIdUsuario(idI);
        
        try {
            ud.editar(uv);
            System.out.println("Se Actualizaron Los Datos Correctamente");
            listar(req, resp);

        } catch (Exception e) {
            System.out.println("Error en la Actualizacion del registro "+e.getMessage().toString());
        }
}
}



 