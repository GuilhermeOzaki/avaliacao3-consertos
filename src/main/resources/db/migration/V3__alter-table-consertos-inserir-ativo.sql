-- Campo "ativo", para permitir a exclusão lógica:

alter table consertos add ativo boolean;

-- Os registros já existentes ficariam com null.
-- No momento da migration, todos os consertos ficam "ativos":

update consertos set ativo = true;
