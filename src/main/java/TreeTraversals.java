import java.util.List;

/**
 * Utility class containing tree traversal algorithms for a {@link BinaryTree}.
 *
 * <p>Your task: implement each of the four traversal methods below.
 * Each method must visit every node in the tree exactly once and return
 * the node values collected in the order defined by the traversal.
 *
 * <p>Do NOT modify the method signatures.
 */
public class TreeTraversals {

    /**
     * Performs a pre-order traversal of the subtree rooted at {@code node}.
     *
     * <p>Visit order: <strong>root → left → right</strong>
     *
     * @param <V>    the type of value stored in the tree
     * @param node   the root of the subtree to traverse (may be {@code null})
     * @param result the list to append visited values to (never {@code null})
     */
    public static <V> void preorder(BinaryTree<V> node, List<V> result) {
        // TODO: implement pre-order traversal
        if (node == null) return;

        result.add(node.getValue());
        preorder(node.getLeft(), result);
        preorder(node.getRight(), result);
    }

    /**
     * Performs an in-order traversal of the subtree rooted at {@code node}.
     *
     * <p>Visit order: <strong>left → root → right</strong>
     *
     * @param <V>    the type of value stored in the tree
     * @param node   the root of the subtree to traverse (may be {@code null})
     * @param result the list to append visited values to (never {@code null})
     */
    public static <V> void inorder(BinaryTree<V> node, List<V> result) {
        // TODO: implement in-order traversal
        if (node == null) return;
        inorder(node.getLeft(), result);
        result.add(node.getValue());
        inorder(node.getRight(), result);
    }

    /**
     * Performs a post-order traversal of the subtree rooted at {@code node}.
     *
     * <p>Visit order: <strong>left → right → root</strong>
     *
     * @param <V>    the type of value stored in the tree
     * @param node   the root of the subtree to traverse (may be {@code null})
     * @param result the list to append visited values to (never {@code null})
     */
    public static <V> void postorder(BinaryTree<V> node, List<V> result) {
        // TODO: implement post-order traversal
        if (node == null) return;
        postorder(node.getLeft(), result);
        postorder(node.getRight(), result);
        result.add(node.getValue());
    }

    /**
     * Performs a level-order (breadth-first) traversal of the subtree rooted at {@code node}.
     *
     * <p>Nodes are visited level by level, left to right, starting from {@code node}.
     *
     * <p>Hint: use a {@link java.util.Queue} to keep track of nodes to visit next.
     *
     * @param <V>    the type of value stored in the tree
     * @param node   the root of the subtree to traverse (may be {@code null})
     * @param result the list to append visited values to (never {@code null})
     */
    public static <V> void levelorder(BinaryTree<V> node, List<V> result) {
        // TODO: implement level-order traversal
        throw new UnsupportedOperationException("levelorder: not yet implemented");
    }
}
