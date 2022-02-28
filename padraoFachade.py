class Aluno():
  def set_nome(self, nomAluno: string):
    pass

  def get_nome(self):
    pass

class Curso():
  def set_nome(self, nomeCurso: string):
    pass

  def get_nome(self):
    pass

class Turma():
  def get_nomeTurma(self):
    pass

  def set_curso(self, curso):
    pass

  def get_curso(self) -> Curso:
    pass

  def add_aluno(self, aluno):
    pass  

  def get_alunos(self):
    pass

class Escola():
  def get_curso(self, codigoCurso: int):
    pass
  
  def get_aluno(self, codigoAluno: int):
    pass

class PadraoFachada():
  def matricularAluno(self, codigoAluno: int, codigoCurso: int, Turma: Turma):
    if (Turma==None):
      Turma = Turma()
      Curso = Escola.get_curso(codigoCurso)
      Turma.set_curso(c)
    rex = Escola.get_aluno(codigoAluno)
    Turma.add_aluno(rex)
  
  def ExibirStatus(Turma: Turma):
    NomeCurso = Turma.get_curso().get_Nome()
    Alunos = turma.get_alunos
    for alunos in Alunos:
      print(alunos.get_nome())

class MatriculaGUI(): #Estava faltando
  def __init__(self) -> None:
    Fachada = PadraoFachada();

class MatriculaGUI(): #Estava faltando
  def __init__(self) -> None:
    Fachada = PadraoFachada();