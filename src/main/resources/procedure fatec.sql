create or replace procedure pc_bebida_mais_vendida(codigo_mercadoria out int) is
begin
 select to_char(X.codigo_bebida) into codigo_mercadoria
   from (select i.codigo_bebida, count(i.codigo_bebida) as QUANT
           from item_venda i
         having count(i.codigo_bebida) = (select max(count(i.codigo_bebida)) as maior
                                           from item_venda i
                                          group by i.codigo_bebida)
          group by i.codigo_bebida) X
  where rownum = 1;
end pc_bebida_mais_vendida;
