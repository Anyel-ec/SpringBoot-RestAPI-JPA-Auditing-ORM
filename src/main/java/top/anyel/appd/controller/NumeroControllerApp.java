package top.anyel.appd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.anyel.appd.services.NumeroServiceApp;
import top.anyel.appd.models.ParesApp;
import top.anyel.appd.models.ImparesApp;

import java.util.List;

@RestController
@RequestMapping("/app/numeros")
public class NumeroControllerApp {

    @Autowired
    private NumeroServiceApp numeroServiceApp;

    @PostMapping("/guardar/{numero}")
    public void guardarNumero(@PathVariable Long numero) {
        numeroServiceApp.guardarNumero(numero);
    }

    @GetMapping("/tabla/{numero}")
    public String determinarTabla(@PathVariable Long numero) {
        return numeroServiceApp.determinarTabla(numero);
    }

    @GetMapping("/pares")
    public List<ParesApp> obtenerPares() {
        return numeroServiceApp.obtenerPares();
    }

    @GetMapping("/impares")
    public List<ImparesApp> obtenerImpares() {
        return numeroServiceApp.obtenerImpares();
    }
}
