# Azure Cognitive Search: Utilizando AI Search para Indexação e Consulta de Dados

Este projeto tem como objetivo criar uma solução eficiente de busca de conhecimento, utilizando recursos de indexação e consulta fornecidos pelo Azure Cognitive Search. Por meio da integração com serviços de inteligência artificial, como análise de sentimentos e extração de informações-chave, a solução visa facilitar a identificação de insights valiosos em grandes conjuntos de dados, como revisões de clientes. Essa abordagem possibilita uma compreensão mais profunda das experiências dos clientes e permite tomar decisões informadas para melhorar produtos e serviços.

## Passo a Passo:

### Criação de Recursos Azure:

1. **Crie um recurso Azure AI Search:**
   - Acesse o portal do Azure e crie um novo recurso Azure AI Search.
   - Escolha um nome único e uma região para hospedar o serviço.
   - Selecione a camada de preços "Basic".

2. **Crie um recurso Azure AI Services:**
   - Retorne à página inicial do portal Azure e crie um novo recurso Azure AI Services.
   - Certifique-se de que este recurso esteja na mesma região do recurso Azure AI Search.
   - Escolha a camada de preços "Standard S0".

3. **Crie uma conta de armazenamento:**
   - Crie uma conta de armazenamento no portal Azure.
   - Certifique-se de que esta conta esteja na mesma região dos recursos Azure AI Search e AI Services.
   - Configure um contêiner de blobs para armazenar os documentos a serem indexados.

### Extração e Enriquecimento de Dados:

4. **Extraia dados de uma fonte de dados:**
   - Faça o download dos dados de revisão de clientes de Fourth Coffee do [link](https://aka.ms/mslearn-coffee-reviews) fornecido.
   - Extraia os arquivos para uma pasta.
   - Verifique a qualidade e a estrutura dos dados antes da importação.

5. **Carregue os documentos no armazenamento Azure:**
   - No portal Azure, crie um contêiner de blobs no armazenamento Azure com acesso público.
   - Faça o upload dos arquivos de revisão de clientes para o contêiner.
   - Organize os arquivos para facilitar a indexação e consulta.

6. **Indexe os documentos:**
   - No portal Azure, acesse o recurso Azure AI Search.
   - Utilize o assistente de importação de dados para criar um índice e importar os documentos do armazenamento Azure.
   - Configure um pipeline de enriquecimento para aplicar análise de sentimentos e extração de frases-chave.

### Consulta do Índice:

7. **Execute consultas no índice:**
   - Utilize o Explorador de Pesquisa no portal Azure para escrever e testar consultas.
   - Escreva consultas para buscar documentos no índice, filtrando por localização e sentimentos.
   - Experimente utilizar filtros avançados e ranking de relevância para melhorar os resultados.

## Insights:

- O Azure Cognitive Search oferece uma solução robusta para indexação e busca de dados.
- A integração com serviços de IA permite enriquecer os dados com insights gerados automaticamente.
- A personalização dos índices e filtros melhora a precisão das buscas.

## Possibilidades de Ferramentas Beneficiadas:

- **Análise de Sentimentos de Clientes:** Identificação de sentimentos positivos e negativos em revisões de clientes.
- **Busca por Localização:** Filtre revisões por localização para entender tendências regionais.
- **Extração de Frases-Chave:** Identifique tópicos principais abordados nas revisões dos clientes.
- **Detecção de Idiomas:** Identifique automaticamente o idioma dos textos para análises multilíngues.
- **Geração de Resumos:** Utilize IA para resumir longas revisões e facilitar a análise de tendências.

## Aprendizados Adquiridos:

- Configuração de recursos Azure para indexação e busca de dados.
- Utilização de serviços de IA para enriquecer dados e extrair insights relevantes.
- Execução de consultas avançadas para encontrar informações específicas no índice.
- Implementação de técnicas de otimização de pesquisa para melhorar a experiência do usuário.
- Aplicação de filtros e ordenações para segmentação mais precisa dos resultados.

