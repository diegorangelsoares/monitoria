package com.diego.monitoria.resources;

import com.diego.monitoria.model.Gson;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**Classe de tratamentos do Requisicao
 * @author Diego Rangel
 */
@RestController
@RequestMapping(value="/api")
@CrossOrigin(origins="*")
public class RequisicaoResource {

    //@Autowired
    //EnderecoService enderecoService;

    //Endpoint do swagger
    @GetMapping( path="TesteRequisicao/{url}")
    public ResponseEntity<?> getRequisicao(@PathVariable("url") String url){
        //verifyIfclisExists(id);
        //Endereco endereco = new Endereco();
        //Endereco endereco = enderecoService.retornaEndereco(cep);
        return new ResponseEntity<>(url, HttpStatus.OK);
    }

    @PostMapping(path="TesteRequisicao")
    public ResponseEntity<?> save(@Validated @RequestBody Gson gson){
        //uRepository.save(cli);
        return new ResponseEntity<>(gson,HttpStatus.OK);
    }

    /*
    @PostMapping(path="Clientes")
    public ResponseEntity<?> save(@Validated @RequestBody Cliente cli){
        uRepository.save(cli);
        return new ResponseEntity<>(cli,HttpStatus.OK);
    }
     */

}
