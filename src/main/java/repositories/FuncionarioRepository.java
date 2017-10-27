package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import entities.Funcionario;

@Transactional(readOnly = true)
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

	Funcionario fidByCpfOrEmail(String CPF, String email);

	Funcionario findByCpf(String CPF);

	Funcionario findByEmail(String email);

}
