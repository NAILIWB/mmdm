CREATE TABLE Estoque (
  idEstoque INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  nome VARCHAR(50) NULL,
  descricao VARCHAR(250) NULL,
  bloco VARCHAR(20) NULL,
  partNumber VARCHAR(50) NULL,
  serialNumber VARCHAR(50) NULL,
  estadoConservacao VARCHAR(20) NULL,
  PRIMARY KEY(idEstoque)
);

CREATE TABLE Endereco (
  idEndereco INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  logradouro VARCHAR(100) NULL,
  numero VARCHAR(5) NULL,
  CEP VARCHAR(15) NULL,
  complemento VARCHAR(50) NULL,
  bairro VARCHAR(50) NULL,
  cidade VARCHAR(50) NULL,
  uf VARCHAR(20) NULL,
  pais VARCHAR(50) NULL,
  PRIMARY KEY(idEndereco)
);

CREATE TABLE TipoDespacho (
  idTipoDespacho INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  descricao VARCHAR(50) NULL,
  nomeTransportador VARCHAR(50) NULL,
  PRIMARY KEY(idTipoDespacho)
);

CREATE TABLE Posicao (
  idPosicao INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  dataAbertura VARCHAR(8) NULL,
  horaAbertura VARCHAR(8) NULL,
  dataEncerramento VARCHAR(8) NULL,
  horaEncerramento VARCHAR(8) NULL,
  dataFechamento VARCHAR(8) NULL,
  horaFechamento VARCHAR(8) NULL,
  posicao VARCHAR(50) NULL,
  PRIMARY KEY(idPosicao)
);

CREATE TABLE Perfil (
  idPerfil INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  descricaoPerfil VARCHAR(50) NULL,
  PRIMARY KEY(idPerfil)
);

CREATE TABLE DadosBancarios (
  idDadosBancarios INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  banco VARCHAR(20) NULL,
  agencia VARCHAR(20) NULL,
  conta VARCHAR(20) NULL,
  PRIMARY KEY(idDadosBancarios)
);

CREATE TABLE Contatos (
  idContatos INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  telefoneFixo VARCHAR(20) NULL,
  telefoneCel VARCHAR(20) NULL,
  telefoneNextel VARCHAR(20) NULL,
  email VARCHAR(20) NULL,
  msn VARCHAR(20) NULL,
  PRIMARY KEY(idContatos)
);

CREATE TABLE AcessoRemoto (
  idAcessoRemoto INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  tipo VARCHAR(50) NULL,
  ipAcesso VARCHAR(50) NULL,
  ipEquipamento VARCHAR(50) NULL,
  PRIMARY KEY(idAcessoRemoto)
);

CREATE TABLE Localizacao (
  idLocalizacao INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Estoque_idEstoque INTEGER UNSIGNED NOT NULL,
  bandeija VARCHAR(4) NULL,
  plateleira VARCHAR(4) NULL,
  sala VARCHAR(4) NULL,
  PRIMARY KEY(idLocalizacao),
  FOREIGN KEY(Estoque_idEstoque)
    REFERENCES Estoque(idEstoque)
      ON DELETE CASCADE
      ON UPDATE CASCADE
);

CREATE TABLE Permissao (
  idPermissao INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Perfil_idPerfil INTEGER UNSIGNED NOT NULL,
  descricaoPermissao VARCHAR(50) NULL,
  ativo VARCHAR(4) NULL,
  PRIMARY KEY(idPermissao),
  FOREIGN KEY(Perfil_idPerfil)
    REFERENCES Perfil(idPerfil)
      ON DELETE CASCADE
      ON UPDATE CASCADE
);

CREATE TABLE PosicaoRequisicao (
  idPosicaoRequisicao INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Posicao_idPosicao INTEGER UNSIGNED NOT NULL,
  funcionarioEstoque VARCHAR(5) NULL,
  PRIMARY KEY(idPosicaoRequisicao),
  FOREIGN KEY(Posicao_idPosicao)
    REFERENCES Posicao(idPosicao)
      ON DELETE CASCADE
      ON UPDATE CASCADE
);

CREATE TABLE PosicaoOrdemServico (
  idPosicaoOrdemServico INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Posicao_idPosicao INTEGER UNSIGNED NOT NULL,
  funcionarioAbertura VARCHAR(5) NULL,
  funcionarioDesignado VARCHAR(5) NULL,
  PRIMARY KEY(idPosicaoOrdemServico),
  FOREIGN KEY(Posicao_idPosicao)
    REFERENCES Posicao(idPosicao)
      ON DELETE CASCADE
      ON UPDATE CASCADE
);

CREATE TABLE Requisicao (
  idRequisicao INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Posicao_idPosicao INTEGER UNSIGNED NOT NULL,
  descricao VARCHAR(250) NULL,
  PRIMARY KEY(idRequisicao),
  FOREIGN KEY(Posicao_idPosicao)
    REFERENCES Posicao(idPosicao)
      ON DELETE CASCADE
      ON UPDATE CASCADE
);

CREATE TABLE Venda (
  idVenda INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Requisicao_idRequisicao INTEGER UNSIGNED NOT NULL,
  tipoPagamento VARCHAR(20) NULL,
  PRIMARY KEY(idVenda),
  FOREIGN KEY(Requisicao_idRequisicao)
    REFERENCES Requisicao(idRequisicao)
      ON DELETE CASCADE
      ON UPDATE CASCADE
);

CREATE TABLE Devolucao (
  idDevolucao INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Estoque_idEstoque INTEGER UNSIGNED NOT NULL,
  Requisicao_idRequisicao INTEGER UNSIGNED NOT NULL,
  motivo VARCHAR(150) NULL,
  dataDevolucao VARCHAR(8) NULL,
  PRIMARY KEY(idDevolucao),
  FOREIGN KEY(Requisicao_idRequisicao)
    REFERENCES Requisicao(idRequisicao)
      ON DELETE CASCADE
      ON UPDATE CASCADE,
  FOREIGN KEY(Estoque_idEstoque)
    REFERENCES Estoque(idEstoque)
      ON DELETE CASCADE
      ON UPDATE CASCADE
);

CREATE TABLE Despacho (
  idDespacho INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Requisicao_idRequisicao INTEGER UNSIGNED NOT NULL,
  TipoDespacho_idTipoDespacho INTEGER UNSIGNED NOT NULL,
  dataDespacho VARCHAR(8) NULL,
  horaDespacho VARCHAR(8) NULL,
  rastreador VARCHAR(20) NULL,
  observacoes VARCHAR(250) NULL,
  PRIMARY KEY(idDespacho),
  FOREIGN KEY(TipoDespacho_idTipoDespacho)
    REFERENCES TipoDespacho(idTipoDespacho)
      ON DELETE CASCADE
      ON UPDATE CASCADE,
  FOREIGN KEY(Requisicao_idRequisicao)
    REFERENCES Requisicao(idRequisicao)
      ON DELETE CASCADE
      ON UPDATE CASCADE
);

CREATE TABLE Fornecedor (
  idFornecedor INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  DadosBancarios_idDadosBancarios INTEGER UNSIGNED NOT NULL,
  Contatos_idContatos INTEGER UNSIGNED NOT NULL,
  Endereco_idEndereco INTEGER UNSIGNED NOT NULL,
  razaoSocial VARCHAR(100) NULL,
  cpfCnpj VARCHAR(14) NULL,
  PRIMARY KEY(idFornecedor),
  FOREIGN KEY(Endereco_idEndereco)
    REFERENCES Endereco(idEndereco)
      ON DELETE CASCADE
      ON UPDATE CASCADE,
  FOREIGN KEY(Contatos_idContatos)
    REFERENCES Contatos(idContatos)
      ON DELETE CASCADE
      ON UPDATE CASCADE,
  FOREIGN KEY(DadosBancarios_idDadosBancarios)
    REFERENCES DadosBancarios(idDadosBancarios)
      ON DELETE CASCADE
      ON UPDATE CASCADE
);

CREATE TABLE Cliente (
  idCliente INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Endereco_idEndereco INTEGER UNSIGNED NOT NULL,
  AcessoFuncRemoto_idAcessoRemoto INTEGER UNSIGNED NOT NULL,
  DadosBancarios_idDadosBancarios INTEGER UNSIGNED NOT NULL,
  Contatos_idContatos INTEGER UNSIGNED NOT NULL,
  razaoSocial VARCHAR(100) NULL,
  cpfCnpj VARCHAR(14) NULL,
  nomeContato VARCHAR(100) NULL,
  despachoDisponivel VARCHAR(20) NULL,
  PRIMARY KEY(idCliente),
  FOREIGN KEY(Contatos_idContatos)
    REFERENCES Contatos(idContatos)
      ON DELETE CASCADE
      ON UPDATE CASCADE,
  FOREIGN KEY(DadosBancarios_idDadosBancarios)
    REFERENCES DadosBancarios(idDadosBancarios)
      ON DELETE CASCADE
      ON UPDATE CASCADE,
  FOREIGN KEY(AcessoFuncRemoto_idAcessoRemoto)
    REFERENCES AcessoRemoto(idAcessoRemoto)
      ON DELETE CASCADE
      ON UPDATE CASCADE,
  FOREIGN KEY(Endereco_idEndereco)
    REFERENCES Endereco(idEndereco)
      ON DELETE CASCADE
      ON UPDATE CASCADE
);

CREATE TABLE Funcionario (
  idFuncionario INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Perfil_idPerfil INTEGER UNSIGNED NOT NULL,
  DadosBancarios_idDadosBancarios INTEGER UNSIGNED NOT NULL,
  Contatos_idContatos INTEGER UNSIGNED NOT NULL,
  Endereco_idEndereco INTEGER UNSIGNED NOT NULL,
  nome VARCHAR(100) NULL,
  cpf VARCHAR(11) NULL,
  identidade VARCHAR(50) NULL,
  nrCtps VARCHAR(20) NULL,
  planoSaude VARCHAR(50) NULL,
  PRIMARY KEY(idFuncionario),
  FOREIGN KEY(Endereco_idEndereco)
    REFERENCES Endereco(idEndereco)
      ON DELETE CASCADE
      ON UPDATE CASCADE,
  FOREIGN KEY(Contatos_idContatos)
    REFERENCES Contatos(idContatos)
      ON DELETE CASCADE
      ON UPDATE CASCADE,
  FOREIGN KEY(DadosBancarios_idDadosBancarios)
    REFERENCES DadosBancarios(idDadosBancarios)
      ON DELETE CASCADE
      ON UPDATE CASCADE,
  FOREIGN KEY(Perfil_idPerfil)
    REFERENCES Perfil(idPerfil)
      ON DELETE CASCADE
      ON UPDATE CASCADE
);

CREATE TABLE AcessoFunc (
  idAcessoFunc INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Funcionario_idFuncionario INTEGER UNSIGNED NOT NULL,
  usuario VARCHAR(8) NULL,
  senha VARCHAR(8) NULL,
  dataCadastro VARCHAR(8) NULL,
  PRIMARY KEY(idAcessoFunc),
  FOREIGN KEY(Funcionario_idFuncionario)
    REFERENCES Funcionario(idFuncionario)
      ON DELETE CASCADE
      ON UPDATE CASCADE
);

CREATE TABLE AcessoCliente (
  idAcessoCliente INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Cliente_idCliente INTEGER UNSIGNED NOT NULL,
  usuario VARCHAR(8) NULL,
  senha VARCHAR(8) NULL,
  dataCadastro VARCHAR(8) NULL,
  PRIMARY KEY(idAcessoCliente),
  FOREIGN KEY(Cliente_idCliente)
    REFERENCES Cliente(idCliente)
      ON DELETE CASCADE
      ON UPDATE CASCADE
);

CREATE TABLE HistoricoAcessoFunc (
  idHistoricoAcesso INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  AcessoFunc_idAcessoFunc INTEGER UNSIGNED NOT NULL,
  dataAcesso VARCHAR(8) NULL,
  PRIMARY KEY(idHistoricoAcesso),
  FOREIGN KEY(AcessoFunc_idAcessoFunc)
    REFERENCES AcessoFunc(idAcessoFunc)
      ON DELETE CASCADE
      ON UPDATE CASCADE
);

CREATE TABLE HistoricoAcessoCliente (
  idHistoricoAcessoCliente INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  AcessoCliente_idAcessoCliente INTEGER UNSIGNED NOT NULL,
  dataAcesso VARCHAR(8) NULL,
  PRIMARY KEY(idHistoricoAcessoCliente),
  FOREIGN KEY(AcessoCliente_idAcessoCliente)
    REFERENCES AcessoCliente(idAcessoCliente)
      ON DELETE CASCADE
      ON UPDATE CASCADE
);

CREATE TABLE OrdemServico (
  idOrdemServico INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Posicao_idPosicao INTEGER UNSIGNED NOT NULL,
  Cliente_idCliente INTEGER UNSIGNED NOT NULL,
  tipo VARCHAR(50) NULL,
  descricao VARCHAR(250) NULL,
  servicoExecutado VARCHAR(500) NULL,
  PRIMARY KEY(idOrdemServico),
  FOREIGN KEY(Cliente_idCliente)
    REFERENCES Cliente(idCliente)
      ON DELETE CASCADE
      ON UPDATE CASCADE,
  FOREIGN KEY(Posicao_idPosicao)
    REFERENCES Posicao(idPosicao)
      ON DELETE CASCADE
      ON UPDATE CASCADE
);

CREATE TABLE Equipamento (
  idEquipamento INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Estoque_idEstoque INTEGER UNSIGNED NOT NULL,
  Cliente_idCliente INTEGER UNSIGNED NOT NULL,
  modalidade VARCHAR(50) NULL,
  fabricante VARCHAR(50) NULL,
  modelo VARCHAR(50) NULL,
  PRIMARY KEY(idEquipamento),
  FOREIGN KEY(Cliente_idCliente)
    REFERENCES Cliente(idCliente)
      ON DELETE CASCADE
      ON UPDATE CASCADE,
  FOREIGN KEY(Estoque_idEstoque)
    REFERENCES Estoque(idEstoque)
      ON DELETE CASCADE
      ON UPDATE CASCADE
);


