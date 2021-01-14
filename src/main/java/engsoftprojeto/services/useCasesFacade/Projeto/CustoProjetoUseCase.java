package engsoftprojeto.services.useCasesFacade.Projeto;

import engsoftprojeto.models.Projeto;
import engsoftprojeto.models.Tarefa;
import engsoftprojeto.repositories.ProjetoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustoProjetoUseCase {

    private final ProjetoRepository projetoRepository;

    public CustoProjetoUseCase(ProjetoRepository projetoRepository) {
        this.projetoRepository = projetoRepository;
    }
    //GUARDAR NA BD E VALIDACAO DE EMPREGADO

    public Optional<Projeto> custo(Long id) {
        try {
            int custoTotal = 0;
            Optional<Projeto> optionalProjeto = projetoRepository.findById(id);
            if (optionalProjeto.isPresent()) {
                Projeto projeto = optionalProjeto.get();
                for (Tarefa t : projeto.tarefas) {
                    if(t.getEmpregado() != null)
                    custoTotal = custoTotal + t.custoTarefa();
                }
                return Optional.of(projeto);
            }
            return Optional.empty();
        } catch (Exception e) {
            return Optional.ofNullable(projetoRepository.findById(id)).orElseThrow(RuntimeException::new);
        }
    }
}
