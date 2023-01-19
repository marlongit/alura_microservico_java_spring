package br.com.alurafood.pagamentos.repository;

import br.com.alurafood.pagamentos.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Utilizando essa class PagamentosRepository como base para
 * persistência de dados com usando JPA. É necessário informar qual a class que será
 * a entidade base e qual o tipo de id que vamos utilizar
 * Bastante utilizado para realizar CRUD.
 * Podemos utilizar JPQL para implementar consultas personalizadas
 */
public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}
