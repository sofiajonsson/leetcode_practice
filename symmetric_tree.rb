def is_symmetric(root)
    return is_mirror(root, root)
end

def is_mirror(t1, t2)
    return true if t1 == nil and t2 == nil
    return false if t1 == nil or t2 == nil

    return (t1.val == t2.val) && is_mirror(t1.right, t2.left) && is_mirror(t1.left, t2.right)
end
