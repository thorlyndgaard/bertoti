# Relatório do Projeto – API (3° Semestre)

## 1.0       Introdução

O DataSkill funciona como o mapa de talentos oficial da companhia. Ele permite que cada profissional registre sua trajetória, competências e certificações, criando uma vitrine interna de potencialidades.

 O objetivo é conectar as habilidades certas às oportunidades ideais, facilitando a mobilidade interna e garantindo que o conhecimento de cada colaborador seja visível e aproveitado em iniciativas estratégicas da organização.

 ---

 ## 2.1 Contexto do Cliente

 **Nome**
  ALTAVE

  **Atuação**
  Tecnologia e Defesa — especializada no desenvolvimento e fornecimento de aeróstatos (balões cativos de alta tecnologia) para monitoramento, vigilância aérea e telecomunicações. A empresa atua em projetos estratégicos voltados para segurança pública, defesa, grandes eventos e proteção de infraestruturas críticas.
  

##  2.2 Necessidade Identificada
A ausência de um mapeamento estruturado de competências gerava lacunas na gestão estratégica de talentos, caracterizadas por:

- Fragmentação de Dados: Informações sobre qualificações dispersas em arquivos isolados ou desatualizados.

- Alocação Ineficiente: Dificuldade técnica em identificar o perfil exato para a demanda de cada projeto.

- Subjetividade na Gestão: Dependência do conhecimento informal dos gestores para localizar talentos.

- Invisibilidade de Especialistas: Perda de agilidade estratégica por desconhecimento das capacidades internas.

- Capacitação Genérica: Baixa eficácia no planejamento de treinamentos por falta de diagnósticos reais de lacunas (gaps) de competência

## 2.3 Solução Estratégica
A solução consiste em um ecossistema digital centralizado para a governança de capital humano, focado em transformar informações em inteligência operacional:

- Repositório Unificado: Consolidação de Hard Skills, Soft Skills e certificações em uma base de dados estruturada.

- Mecanismo de Busca de Especialistas: Filtros técnicos avançados para localização imediata de profissionais por competência específica.

- Dashboards de Gap Analysis: Visão gerencial sobre a distribuição de habilidades e identificação de necessidades de treinamento.

-   Alocação Baseada em Dados: Redução da subjetividade e do conhecimento informal na montagem de squads e projetos.

## 2.4 Tecnologias Utilizadas
 
| Categoria | Tecnologias |
|---|---|
| **Back-end** | Java 21 · Spring Boot · JPA / Hibernate · Maven |
| **Front-end** | Angular |
| **Banco de Dados** | MySQL 8 |
| **Documentação de API** | Swagger (OpenAPI) |
| **Testes** | Postman |
| **Controle de Versão** | Git · GitHub |
| **IDEs** | IntelliJ IDEA · VS Code |

## 3.0 Contribuições Pessoais
Atuação concentrada na construção da inteligência da plataforma (Back-end) e na garantia de uma comunicação eficiente e persistente entre os módulos:

Desenvolvimento de APIs RESTful: Modelagem completa de rotas, DTOs e padronização de respostas para integração com o Front-end.

Feature de Funcionario: Criação dos serviços para registro, processamento e armazenamento do perfil de funcionário.

Regras de Negócio e Persistência: Implementação da lógica de validação de dados utilizando Spring Data JPA e Hibernate.

Documentação Técnica com Swagger: Estruturação da documentação OpenAPI, facilitando o consumo dos endpoints e a manutenção do sistema.

## 4.0 Hard Skills Adquiridas
- Ecossistema Java & Spring Boot: Domínio na estruturação de aplicações em camadas (Controller, Service, Repository) utilizando Java 21.

- Desenvolvimento REST: Proficiência em verbos HTTP, códigos de status e princípios de arquitetura para APIs modernas.

- Persistência de Dados: Mapeamento objeto-relacional (ORM) e manipulação de bancos de dados relacionais com MySQL.

- Testes e Documentação: Validação de fluxos complexos via Postman e automação de documentação com Swagger.

- Controle de Versão: Gestão de código em equipe utilizando Git, com foco em boas práticas de commit e organização de branches.

## 4.1 Soft Skills Desenvolvidas
- Metodologia Ágil (Scrum): Vivência prática em ambiente colaborativo, participando de ritos de planejamento e entregas incrementais.

- Pensamento Analítico: Tradução de desafios de negócio em requisitos técnicos e modelagem de dados estruturada.

- Comunicação Assertiva: Alinhamento técnico entre o back-end e as necessidades de interface do usuário.

- Proatividade e Responsabilidade: Iniciativa na resolução de bugs e compromisso com os prazos das sprints.

---

# Relatório do Projeto – API (4º Semestre)

- **Projeto:** Tracker
- **Equipe:** Caramel Stray
- **Período:** 2026/1
- **Repositório do projeto:** [CaramelStray-Api-4Semestre](https://github.com/CaramelStray/CaramelStray-Api-4Semestre)

## 1. Introdução

O Tracker é um sistema de gestão de manutenções desenvolvido para a ALTAVE durante a API do 4º semestre de Banco de Dados da Fatec São José dos Campos. A plataforma reúne informações de clientes, contratos, sistemas instalados, ativos, técnicos e ordens de serviço para apoiar o planejamento e o acompanhamento das manutenções.

## 2. Contexto do cliente e desafio

A ALTAVE opera sistemas distribuídos em diferentes localidades, com necessidades de manutenção que variam conforme o uso dos equipamentos e a distância até o cliente. Nesse cenário, organizar atendimentos, deslocamentos e prazos contratuais exige uma visão integrada da operação.

O desafio do projeto foi centralizar essas informações e facilitar o acompanhamento das ordens de manutenção, da disponibilidade dos técnicos e do histórico de intervenções.

## 3. Solução desenvolvida

O Tracker permite cadastrar clientes, contratos, sistemas, máquinas, ativos e técnicos; criar e acompanhar ordens de serviço; planejar viagens; registrar checklists e consultar o histórico de manutenção. A aplicação também oferece calendário, mapa e painel de indicadores para apoiar a equipe na organização dos atendimentos.

O back-end expõe uma API REST utilizada pela interface web. Sua estrutura separa controladores, regras de negócio, objetos de transferência de dados (DTOs) e acesso ao banco de dados.

## 4. Tecnologias utilizadas

| Camada | Tecnologias |
|---|---|
| Back-end | Java 17, Spring Boot 3.3.5, Spring Data JPA, Hibernate e Maven |
| Autenticação e validação | Spring Security, JWT e Bean Validation |
| Banco de dados | PostgreSQL e PostGIS |
| Front-end | Vue 3, TypeScript e Vite |
| Ambiente e versionamento | Docker Compose, Git e GitHub |

## 5. Contribuições pessoais

Atuei principalmente no desenvolvimento do **back-end**, implementando uma parte significativa dos endpoints da API REST que conectam as funcionalidades do sistema à interface web. Esse trabalho envolveu a construção de rotas e a integração entre controladores, serviços, DTOs e persistência de dados.

Também colaborei para a **qualidade e a padronização do código**, ajudando a manter convenções consistentes entre os módulos e a organizar as implementações para facilitar a leitura, a integração e a manutenção do projeto.

## 6. Aprendizados

### Hard skills

- Desenvolvimento de APIs REST com Java e Spring Boot, incluindo operações de cadastro, consulta, atualização e exclusão.
- Organização do back-end em camadas e uso de DTOs para a comunicação entre a API e o front-end.
- Persistência de dados relacionais com Spring Data JPA, Hibernate e PostgreSQL.
- Aplicação de validações e tratamento de respostas e erros nas rotas da API.
- Colaboração em um projeto que utiliza autenticação com Spring Security e JWT.

### Soft skills

- Comunicação com a equipe para alinhar contratos de API e necessidades da interface.
- Atenção à consistência do código desenvolvido em conjunto.
- Organização das entregas ao longo das sprints e adaptação às demandas do projeto.
