%  tourne indéfiniment et remplit le ruban de la suite 01010101010 (exercice proposé par Turing)

%                                             0000000000000000000                                                    X
%                                                      X
G 1 G 1 G 0 G 1 G 1
%                                             0000011011000000000                                                    X
%                                                  X 
boucle
%                                             00000110101011000000000                                                    X
%                                                  X 
  0
  G 1 G 1
%                                             00011010101011000000000                                                    X
%                                                X 
  boucle D D si (1) fin } }
%                                             00011010101011000000000                                                    X
%                                                          X 
  0
  D 1 D 1
%                                             0000011010110000000                                                    X
%                                                        X
  boucle G G si (1) fin } }
%                                             0000011010110000000                                                    X
%                                                  X
  I P
}

#
