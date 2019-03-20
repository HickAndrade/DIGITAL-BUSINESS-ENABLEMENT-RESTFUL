package br.com.fiap.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.com.fiap.bo.ProdutoBO;
import br.com.fiap.to.ProdutoTO;

@SuppressWarnings("all")
@Path("/Produto")
public class ProdutoResource {
	private ProdutoBO produtoBo = ProdutoBO.getInstance();

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(ProdutoTO produto, @Context UriInfo uriInfo) {
		produtoBo.cadastrar(produto);
		System.out.println(produto.getCodigo());
		System.out.println(produto.getPreco());
		System.out.println(produto.getQuantidade());
		System.out.println(produto.getDescricao());
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.path(Integer.toString(produto.getCodigo()));
		return Response.created(builder.build()).build();

	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<ProdutoTO> buscar() {
		return produtoBo.listar();
	}

	@Path("/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ProdutoTO buscar(@PathParam("id") int codigo) {

		return ProdutoBO.consultaBO(codigo);
	}

	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizar(ProdutoTO produto, @PathParam("id") int codigo) {
		produto.setCodigo(codigo);
		produtoBo.atualizar(produto);
		return Response.ok().build();
	}

	@DELETE
	@Path("/{id}")
	public void remover(@PathParam("id") int codigo) {
		produtoBo.remover(codigo);
	}

}