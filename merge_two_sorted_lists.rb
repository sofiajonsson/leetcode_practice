def merge_two_lists(l1, l2)
    return l1 unless l2
    return l2 unless l1

    min_node,max_node = l1.val < l2.val ? [l1,l2] : [l2,l1]
    min_node.next = merge_two_lists(min_node.next,max_node)
    min_node
end
