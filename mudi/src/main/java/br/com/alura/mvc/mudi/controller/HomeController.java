package br.com.alura.mvc.mudi.controller;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Bomba de ar para encher pneus, com alavanca, 60 cm, Vonder");
		pedido.setDescricao("Possui corpo e plataforma de apoio em plástico reforçado,"
				+ " manômetro para indicação da pressão e mangueira plástica com 60 cm e bico.");
		pedido.setUrlProduto("https://www.amazon.com.br/gp/product/B076YJ31QF/ref=ox_sc_act_image_1?smid=A1ZZFT5FULY4LN&psc=1");
		pedido.setUrlImagem("https://images-na.ssl-images-amazon.com/images/I/517mc5mbbGL._AC_SL1000_.jpg");
		pedido.setDataEntrega(LocalDate.now());
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		return "home";
	}
}
