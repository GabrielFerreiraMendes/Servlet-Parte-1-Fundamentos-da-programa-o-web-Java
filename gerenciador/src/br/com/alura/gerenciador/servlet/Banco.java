package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<Empresa>();
	private static Integer chaveSequencial = 1;

	static {

		Empresa empresa = new Empresa();
		empresa.setNome("Alura");
		empresa.setId(Banco.chaveSequencial++);

		lista.add(empresa);

		Empresa emp = new Empresa();
		emp.setNome("Google");
		emp.setId(Banco.chaveSequencial++);

		lista.add(emp);
	}

	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		Banco.lista.add(empresa);
	}

	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}

	public void removeEmpresa(Integer paramId) {

		Iterator<Empresa> it = lista.iterator();

		while (it.hasNext()) {
			Empresa empresa = it.next();

			if (empresa.getId() == paramId) {
				it.remove();
			}
		}
	}

	public Empresa buscaEmpresaPorId(Integer paramId) {
		for (Empresa empresa : lista) {
			if (empresa.getId() == paramId) {
				return empresa;
			}
		}

		return null;
	}

}
