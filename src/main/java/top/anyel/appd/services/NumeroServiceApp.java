package top.anyel.appd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.anyel.appd.models.ParesApp;
import top.anyel.appd.models.ImparesApp;
import top.anyel.appd.repositories.ParesRepositoryApp;
import top.anyel.appd.repositories.ImparesRepositoryApp;

import java.util.List;

@Service
public class NumeroServiceApp {

    @Autowired
    private ParesRepositoryApp paresRepositoryApp;

    @Autowired
    private ImparesRepositoryApp imparesRepositoryApp;

    public void guardarNumero(Long numero) {
        if (numero % 2 == 0) {
            ParesApp par = new ParesApp();
            par.setNumero_ap(numero);
            paresRepositoryApp.save(par);
        } else {
            ImparesApp impar = new ImparesApp();
            impar.setNumero_ap(numero);
            imparesRepositoryApp.save(impar);
        }
    }

    public String determinarTabla(Long numero) {
        if (paresRepositoryApp.existsById(numero)) {
            return "PARES";
        } else if (imparesRepositoryApp.existsById(numero)) {
            return "IMPARES";
        } else {
            return "No existe";
        }
    }

    public List<ParesApp> obtenerPares() {
        return paresRepositoryApp.findAll();
    }

    public List<ImparesApp> obtenerImpares() {
        return imparesRepositoryApp.findAll();
    }
}
