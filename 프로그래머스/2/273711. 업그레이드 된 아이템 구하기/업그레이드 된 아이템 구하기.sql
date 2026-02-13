select item_id, item_name, rarity
from item_info
where item_id in (
    select t.item_id
    from item_tree t
    join item_info i on t.parent_item_id = i.item_id
    where i.rarity = 'RARE'
)
order by item_id desc