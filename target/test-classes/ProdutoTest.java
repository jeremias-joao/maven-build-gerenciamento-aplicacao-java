import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import br.com.alura.loja.Produto;

public class ProdutoTest {
	
	@Test
	public void test() {
		Produto p = new Produto("teste", BigDecimal.TEN);
		Assert.assertArrayEquals("teste", p.getNome());
		Assert.assertArrayEquals(BigDecimal.TEN, p.getPreco());
		
	}

}
