# RESUMO do Lab Microsoft Azure - Localizando Serviços por Categoria

Durante o laboratório, aprendi que a plataforma Azure oferece uma ampla variedade de serviços para atender diferentes necessidades, organizados em categorias distintas.

Cada categoria também é subdividida em áreas específicas. Por exemplo, dentro da categoria `Análise`, há a seção `Processamento de Big Data`, que engloba os seguintes serviços:

- Analysis Services
- Clusters HDInsight
- Data Factories
- Data Lake Analytics
- Data Lake Storage Gen1
- Azure Databricks
- Microsoft Graph Data Connect
- Azure HDInsight em clusters AKS

Essa estrutura facilita a localização e escolha dos serviços dentro do portal do Azure.

---

## SLA E ALTA DISPONIBILIDADE

O Acordo de Nível de Serviço (SLA - Service Level Agreement) define a disponibilidade garantida pelo provedor de nuvem. Um SLA de 99% representa um tempo de indisponibilidade de 1,68 hora por semana e 7,2 horas por mês. Já um SLA de 99,9% reduz esse tempo para 10,1 minutos por semana e 43,6 minutos por mês.

Ao criar uma máquina virtual, é possível configurar mecanismos de redundância para aumentar a disponibilidade do serviço. Essa redundância pode ser implementada em diferentes locais para garantir maior resiliência em caso de falhas ou desastres e melhorar a performance ao distribuir os acessos por diversas regiões.

Definir corretamente a arquitetura e infraestrutura utilizadas é essencial, pois algumas configurações podem aumentar significativamente os custos operacionais.

---

## Criação de Máquina Virtual / Imagem e Arquitetura

No painel de criação de máquinas virtuais do Azure, é possível visualizar uma estimativa de custo e configurar diversos parâmetros, como:

- Reinicialização automática
- Monitoramento
- Discos
- Partes
- Modelo de redundância

---

## Data Centers - Globo

O site [datacenters.microsoft.com/globe/explore](https://datacenters.microsoft.com/globe/explore) fornece um mapa interativo, em 2D ou 3D, que mostra a localização dos data centers da Microsoft no mundo. Ele permite visualizar as regiões do Azure, suas geografias e outras informações sobre a infraestrutura global. O mapa também conta com filtros para facilitar a busca por categorias específicas.

---

## Criação de Máquinas Virtuais e Acesso Remoto

A criação de máquinas virtuais no Azure é intuitiva e conta com diversas opções de configuração para facilitar a gestão da infraestrutura. Todas as máquinas e recursos precisam estar associados a um grupo de recursos. Algumas das principais configurações incluem:

- Nome da máquina
- Região
- Zona de disponibilidade
- Tipo de segurança
- Sistema operacional
- Tamanho da instância
- Tipo de autenticação
- Criação de usuário administrador

Outras configurações avançadas incluem:
- Discos
- Rede
- Gerenciamento
- Monitoramento

O Azure também permite a configuração de máquinas virtuais como desktops remotos, o que facilita a disponibilidade para funcionários sem a necessidade de fornecer equipamentos físicos.

---

## Armazenamento

Ao configurar uma conta de armazenamento, é necessário definir um nome único e associá-la a uma assinatura e grupo de recursos.

### Configurações principais:

- **Região**: Escolhida com base em latência e custos.
- **Desempenho**: `Standard` ou `Premium`, dependendo da necessidade de latência.
- **Redundância**:
  - LRS (Local)
  - ZRS (Zona)
  - GRS (Geográfica)
  - GZRS (Zona geográfica)

Outras opções incluem:
- Tipo de armazenamento (`Frio` ou `Quente`)
- Configuração de rede
- Criptografia

### Menu: Armazenamento de Dados

- **Containers**: Gestão de pastas, incluindo backup.
- **Compartilhamento de Arquivos**: Permite conexão via SMB para Windows, Linux e Mac.
- **Filas**: Gerenciamento de mensageria.
- **Tabelas**: Armazenamento de dados estruturados.

---

## Migração de Dados

O Azure oferece ferramentas para migrar dados locais para a nuvem, como:

- **AZ Copy**: Aplicação leve para transporte de arquivos via terminal (Windows, Linux e Mac).
- **Azure Data Box**: Dispositivo físico enviado ao cliente para transferência de grandes volumes de dados.
  - Data Box Disk: Até 35TB
  - Data Box: Até 80TB
  - Data Box Heavy: Até 800TB
  - Data Box Job: Até 1PB

---

## Gerenciador de Armazenamento do Microsoft Azure

Aplicação para gerenciamento de armazenamento no Azure. Basta instalar e sincronizar para acessar assinaturas e contas de armazenamento diretamente pela interface gráfica.

---

## Identidade e Segurança (ENTRA ID)

O gerenciamento de usuários no Azure é feito pelo **Entra ID**, que define permissões e funções de usuários.

Diferente do **RBAC**, o Entra ID foca exclusivamente na administração de identidade e acesso.

Principais funcionalidades:
- Criação e gerenciamento de usuários.
- Convidar usuários externos.
- **Entra Connect**: Sincronização entre ambiente on-premises e a nuvem.
- Contas excluídas podem ser recuperadas em até 30 dias.

### Defender for Cloud

Ferramenta de segurança para ambientes híbridos e cloud-native. Oferece:
- Recomendações de segurança.
- Monitoramento do ambiente.

---

## Calculadoras de Custos

O Azure disponibiliza duas calculadoras:
1. **Estimativa de Preços**: Simula custos de recursos do Azure.
2. **TCO (Total Cost of Ownership)**: Compara os custos entre infraestrutura on-premises e cloud.

Essas ferramentas são fundamentais para planejar custos e evitar gastos inesperados.

---

## Portal de Governança do Azure

O **Portal de Confiança do Serviço** reúne normas de compliance e ferramentas de governança, incluindo:
- Normas de auditoria seguidas pela Microsoft.
- Bloqueio de recursos.
- Purview para gerenciamento de conformidade.

---

## Ferramentas de Implantação do Azure

- **Cloud Shell**: Interface para execução de comandos via PowerShell ou Bash (requer um Storage Account).
- **Bicep**: Automação para criação de máquinas virtuais.
- **Azure Arc**: Gestão remota de máquinas fora do Azure.

---

## Ferramentas de Monitoramento do Azure

- **Azure Monitor**: Insights abrangentes sobre a infraestrutura e desempenho dos recursos.
- **Service Health**: Exibe informações sobre a saúde dos serviços e manutenções programadas.
- **Advisor**: Sugestões para otimização da infraestrutura.

---

Este resumo abrange os principais pontos abordados no laboratório sobre o Azure, facilitando a compreensão dos serviços, custos, segurança e governança disponíveis na plataforma.

